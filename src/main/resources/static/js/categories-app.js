var listItems = document.querySelectorAll('div h2 a');
for (var i = 0; i < listItems.length; i++) {
	listItems[i].addEventListener('mouseover', function() {
		this.style.fontSize = '200%';
	})
	listItems[i].addEventListener('mouseout', function() {
		this.style.fontSize = '100%';
	});
};

$('#copyWrite')
.data('textToggle', "Create By Gene CP Chung")
.hover(function (e) {
    var that = $(this);
    var textToSet = that.data('textToggle');
    that.data('textToggle', that.text());
    that.text(textToSet);
    
}, function (e) {
    var that = $(this);
    var textToSet = that.data('textToggle');
    that.data('textToggle', that.text());
    that.text(textToSet);
});

