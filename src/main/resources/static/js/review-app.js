var $inputField = $('#inputField'),
	$outputField = $('#outputField');

$inputField.keyup(function() {
 $outputField.text($inputField.val());
})

