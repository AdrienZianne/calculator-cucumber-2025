<template>
    <div class="container">
        <div class="settings-container">
            <form class="options">
                <div class="labels options-container">
                    <div v-for="option in options" class="label-container">
                        <label :for="option.name" class="label">{{ option.name }}</label>
                    </div>
                </div>
                <div class="inputs options-container">
                    <div class="input-container" v-for="option in options">
                        <select v-if="option.type == 0" :name="option.name" class="input choice" v-model="option.current" v-on:input="isChanged = true">
                            <option v-for="value in option.values" :selected="value[0] == option.current ? 'selected' : null" :name="value" :value="value[0]">{{ value[1] }}</option>
                        </select>
                        <input v-if="option.type == 1" type="checkbox" class="input boolean" :name="option.name" v-model="option.current" v-on:input="isChanged = true">
                        <input v-if="option.type == 2" type="number" class="input number" :name="option.name" v-model="option.current" :min="option.bounds[0]" :max="option.bounds[1]" v-on:input="isChanged = true">
                    </div>
                </div>
            </form>
            <button :disabled="!isChanged" id="save" @click="updateSettings">Save settings</button>
        </div>
    </div>
</template>

<script>
import { ref } from 'vue'

export default {

    data() {
        return {
            isChanged: false,
            options: [
                { id: "roundingMode", name: "Rounding", type: 0, current: null, values: [[0, "Up"], [1, "Down"], [2, "Ceiling"], [3, "Floor"], [4, "Half up"], [5, "Half down"], [6, "Half even"], [7, "Unnecessary"]] },
                { id: "useRealNotation", name: "Use real notation ?", type: 1, current: null },
                { id: "useScientificNotation", name: "Use scientific notation ?", type: 1, current: null },
                { id: "useDegrees", name: "Use degrees ?", type: 1, current: null },
                { id: "useComplexDomain", name: "Use complex domain ?", type: 1, current: null  },
                { id: "baseNotationConvention", name: "Base notation convention ?", type: 1, current: null },
                { id: "logicalSymbol", name: "Logical symbol ?", type: 1, current: null },
                { id: "realPrecision", name: "Real number precision", type: 2, current: null, bounds: [0, null] },
                { id: "scNotationMaxLeft", name: "Scientific notation max left", type: 2, current: null, bounds: [0, null] },
                { id: "scNotationMaxRight", name: "Scientific notation max right", type: 2, current: null, bounds: [0, null] },
                { id: "seed", name: "Seed", type: 2, current: null, bounds: [null, null] },
            ]
        }
    },
    created() {
        this.fetchSettings()
    },
    methods: {
        fetchSettings() {
            const requestOptions = {
                method: "GET",
                headers: {
                    "Content-Type": "application/json",
                    "Accept": "application/json",
                },
            };
            fetch("http://localhost:8080/settings", requestOptions)
                .then(response => {
                    if (!response.ok) return response.json().then(json => Promise.reject(json));
                    else return response.json();
                })
                .then(data => {
                    for (let i = 0; i < this.options.length; i++) {
                        console.log(i, this.options[i].id, data[this.options[i].id], typeof data[this.options[i].id])

                        if (typeof data[this.options[i].id] == "boolean") {
                            this.options[i].current = data[this.options[i].id]
                        } else if (typeof data[this.options[i].id] == "number") {
                            this.options[i].current = data[this.options[i].id]
                        } else if (typeof data[this.options[i].id] == "string") {
                            this.options[i].current = this.options[i].values.find((o) => !o[1].toUpperCase().replace(" ", "_").localeCompare(data[this.options[i].id]))[0];
                        }
                    }
                })
        },

        updateSettings() {
            console.log(JSON.stringify(this.options.reduce((acc, o) => ({...acc, [o.id]: o.current}), {})))
            const requestOptions = {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                    "Accept": "application/json",
                },
                body: JSON.stringify(this.options.reduce((acc, o) => ({...acc, [o.id]: o.current}), {}))
            };
            fetch("http://localhost:8080/settings", requestOptions)
                .then(response => {
                    if (!response.ok) console.log(response);
                });
            this.isChanged = false
        }
    },
    
};

</script>

<style>

.settings-container {
    display: flex;
    flex-direction: column;
    gap: 20px;
}

.options {
    display: grid;
    grid-template-columns: 1fr 1fr;
    gap: 30px;
}

.options-container {
    gap: 10px;
    display: flex;
    flex-direction: column;
}

.label-container {
    justify-content: right;
    width: 100%;
}

.option {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    width: 100%;
}

.label {
    text-overflow: ellipsis;
    overflow: hidden;
}

.input-container {
    justify-content: start;
    align-items: start;
    justify-items: start;
    text-align: start;
    width: 100%;
}

.input {
    flex-grow: 2;
    border-radius: 2px;
    border: none;
    padding: 2px;
}

.choice {
    width: 100%;
}

/* Chrome, Safari, Edge, Opera */
input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

/* Firefox */
input[type=number] {
  -moz-appearance: textfield;
  appearance: textfield;
}

#save {
    padding: 10px;
    font-size: 18px;
    width: 100%;
}
</style>