

var $inputField = $('#inputField'),
	$outputField = $('#outputField');

$inputField.keyup(function() {
 $outputField.text($inputField.val());
})

var header = document.querySelector('header'),
	h2 = document.createElement('h2');

header.prepend(h2);
h2.innerText = 'Logo again';