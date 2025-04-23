<script>
  export default {
    /**
     * Method for adding a key in the textarea.
     * @param key What we want to write.
     * @param inputText The text where to add key.
     * @param inputId To retrieve the different textaera indexes.
     * 
     * @return inputText modified.
     */
    addKey(key, inputText, inputId) {
      let i = inputId.selectionStart;
      inputText = inputText.slice(0, i) + key + inputText.slice(i);
      inputId.focus();
      setTimeout(() => inputId.setSelectionRange(i+key.length, i+key.length));
      return inputText;
    },
    /**
     * Method for deleting a character at the current index.
     * @param inputText The text where to delete a key.
     * @param inputId To retrieve the different textaera indexes.
     * 
     * @return inputText modified.
     */
     removeASpecificKey(inputText, inputId) {
      let i = inputId.selectionStart;
      let tmp = inputText.split('');
      tmp.splice(i-1, 1);
      inputText = tmp.join('');
      inputId.focus();
      setTimeout(() => inputId.setSelectionRange(i-1, i-1));
      return inputText;
    },
    /**Method for moving the cursor left.
     * @param inputId To retrieve the different textaera indexes.
     * 
    */
    moveCursorLeft(inputId){ 
      //https://www.geeksforgeeks.org/how-to-place-cursor-position-at-end-of-text-in-text-input-field-using-javascript/
      let cursorPosition = inputId.selectionStart;
      inputId.focus();
      if(cursorPosition != 0) inputId.setSelectionRange(cursorPosition-1, cursorPosition-1);
    },
    /**Method for moving the cursor right.
     * @param inputId To retrieve the different textaera indexes.
    */
    moveCursorRight(inputId){
      let cursorPosition = inputId.selectionStart;
      inputId.focus();
      inputId.setSelectionRange(cursorPosition+1, cursorPosition+1);
    },
    /**
     * Method for updating the memoryList.
     * @param inputText The text to push on memory.
     * @param memoryList The current memory list.
     * 
     * @return memoryList modified and isMemory if the memory needs to be activated.
     */
    memoryUpdate(memoryList, inputText){
      memoryList.push(inputText);
      let isMemory = true;
      if(memoryList.length > 5){
        let res = this.memoryRemove(0, memoryList);
        return {
          isMemory: res.isMemory,
          memoryList: res.memoryList,
        }
      } 
      return {
        isMemory: isMemory,
        memoryList: memoryList,
      }
    },
    /**
     * Method that removes an element from the list at a particular index.
     * @param i The index.
     * @param memoryList The current memory list.
     * 
     * @return memoryList modified and isMemory to know if memory needs to be activated.
     */
     memoryRemove(i, memoryList){
      let isMemory = true;
      memoryList.splice(i, 1);
      if(memoryList.length == 0) isMemory = false;
      return {
        isMemory: isMemory,
        memoryList: memoryList,
      }
    },
    /**
     * Method used to remove a specific character from the textarea.
     * The case where enter is pressed is also managed.
     * 
     * @param character the character to delete.
     * @param inputText The text where to delete a specific character.
     * @param inputId To retrieve the different textaera indexes.
     * @param formattedInputText The text formatted for latex.
     * 
     * @return inputText modified
     * @return formattedInputText modified (undefined if in CalculatorPro (not required))
     */
     removeSpecificWord(character, inputText, inputId, formattedInputText){
      if (character == 'Enter') {
        inputText = inputText.slice(0, -1);
        if(formattedInputText != undefined) formattedInputText = formattedInputText.slice(0, -1);
      }
      else if (character != 'Dead'){
        //management of ^ or ¨ or ` spam.
        inputId.blur();
        inputText = inputText.replaceAll(character, '');  
        inputId.focus();
        if(formattedInputText != undefined) formattedInputText = formattedInputText.replaceAll(character, '');
      }
      return {
        inputText: inputText,
        formattedInputText: formattedInputText,
      }
    },
  }
</script>