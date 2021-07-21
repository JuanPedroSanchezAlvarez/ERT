var deleteModal = document.getElementById('deleteModal');

deleteModal.addEventListener('show.bs.modal', function (event) {

	// Button that triggered the modal
	var deleteButton = event.relatedTarget;

	// Extract info from data-bs-* attributes
	var route = deleteButton.getAttribute('data-bs-route');

	// If necessary, you could initiate an AJAX request here and then do the updating in a callback.

	// Update the modal's content.
	//var modalTitle = deleteModal.querySelector('.modal-title')
	//var modalBodyInput = deleteModal.querySelector('.modal-body input')
	//modalTitle.textContent = 'New message to ' + route
	//modalBodyInput.value = route
	var confirmDeleteButton = deleteModal.querySelector('#deleteButton');
	confirmDeleteButton.pathname = route;

})