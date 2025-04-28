import "./assets/main.css";

import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import VueSweetalert2 from "vue-sweetalert2";
import VueMathjax from "vue-mathjax-next";
import "sweetalert2/dist/sweetalert2.min.css";
import katexvue3 from "katex-vue3"

const app = createApp(App);
app.use(VueSweetalert2);
app.use(VueMathjax);
app.use(katexvue3, {
    flags: [
        { left: "$$", right: "$$" }
    ],
    options: {
        displayMode: true,
        throwOneError: false,
    }
});

app.use(router);

app.mount("#app");
