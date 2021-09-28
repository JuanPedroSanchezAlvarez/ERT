var effectModal = document.getElementById('effectModal');
effectModal.addEventListener('show.bs.modal', function (event) {

	// Button that triggered the modal.
	var button = event.relatedTarget;

	// Extract info from data-bs-* attributes.
	var title = button.getAttribute('data-bs-title');
	var text = button.getAttribute('data-bs-text');
	
	// Format the future modal text in paragraphs.
	text = '<p>' + text.replace(/(?:\r\n|\r|\\n)/g, '</p><p>') + '</p>';

	// Get the modal sections to update.
	var modalTitle = effectModal.querySelector('.modal-title');
	var modalText = effectModal.querySelector('.modal-body');

	// Update the modal's content.
	modalTitle.textContent = title;
	modalText.innerHTML = text;
});
