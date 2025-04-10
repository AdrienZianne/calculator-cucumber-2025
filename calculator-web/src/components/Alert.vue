<script>
  import Swal from 'sweetalert2';
  //https://www.npmjs.com/package/vue-sweetalert2
  
  export default {
      /**
       * Method used to display errors.
       *
       * @param error The message to display.
       */
       errorManagement(error) {
          Swal.fire({
              icon: 'error',
              title: 'An error occurred !',
              text: error
          })
      },
      /**
       * Method used to display informations.
       *
       * @param info The message to display.
       */
      infoManagement(info) {
        Swal.fire({
            icon: 'info',
            title: 'Guide',
            html: info
        });
      }
  }
</script>