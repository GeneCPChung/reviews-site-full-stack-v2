var commentNbr = 0;
var addCommentButton = document.getElementById('addCommentButton');

document.getElementById("add").onclick = function() { 
	commentNbr = commentNbr +1;
	var node = document.createElement("p"); 
	node.className = 'commentNbr' + commentNbr;
	var text = document.getElementById("commentArea").value;
	var textnode=document.createTextNode(text); 
	node.appendChild(textnode);

	var	delBtn = document.createElement("button");
	delBtn.className = 'commentNbr' + commentNbr;
	delBtn.id = commentNbr;

	delBtn.addEventListener('click', function() {
		var confirmDel = prompt('Type Yes to Confirm');
		if (confirmDel == "Yes" || confirmDel == "yes") {
			var idName = this.id;
			var idNameToDelete = 'commentDiv' + idName;
			var elementToDelete = document.getElementById(idNameToDelete);
			elementToDelete.parentNode.removeChild(elementToDelete);

		} else {
			alert("Delete Canceled");
		}
	});

	var node2 = document.createTextNode("delete");
	delBtn.appendChild(node2);
	var div = document.createElement("div");
	var specClass = 'commentNbr' + commentNbr;
	div.classList.add(specClass, "aComment");
	div.id = 'commentDiv' + commentNbr;

	
	var element = document.getElementById("comments");
	element.appendChild(div);
	div.appendChild(delBtn);
	div.appendChild(node)
};

