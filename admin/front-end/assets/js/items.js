var items;
$( document ).ready(function() {
    getItems();
});
var isNew=true;
var id=-1;
function save(){
 var name = document.getElementById("name").value;
    var description = document.getElementById("description").value;
    var image = document.getElementById("image").value;
    var price = parseFloat(document.getElementById("price").value);
    if(isNew){
    addItem(name, description, image, price);}
    else {
    updateItem(name, description, image, price, id);}}

    function addItem(name, description, image, price) {
    var data = {
    name: name,
    description: description,
    image: image,
    price: price
    };
                    $.ajax({
                            url: "http://localhost:8000/additem",
                            type: "POST",
                            data: JSON.stringify(data),
                            success: function(id) {
                                data["id"] = parseInt(id);
                                items.push(data);
                                printItems();
                            },
                            error: function(err) {
                                alert(err.responseText);
                            }
                        });
    }
    /*загрузить картинку
    if (file.files && file.files[0]) {
        var FR = new FileReader();

        FR.addEventListener("load", function(e) {
            document.getElementById("img").src = e.target.result;
            image = e.target.result;

            if (isNewItem)
                addItem(name, description, image, price);
            else
                editItem(itemId, name, description, image, price);
        });

        FR.readAsDataURL(file.files[0]);
    }
    else {
            if (isNewItem)
                addItem(name, description, image, price);
            else
                editItem(itemId, name, description, image, price);
    }*/


function printItems(){
var tbody = document.getElementById("items") ;
tbody.innerHTML="";
for(var i =0; i<items.length; i++){
var tr =document.createElement("tr");
//tr.className=
var td_id=document.createElement("td");
td_id.innerHTML=items[i].id ;
var td_name=document.createElement("td");
td_name.innerHTML=items[i].name;
var td_description=document.createElement("td");
td_description.innerHTML=items[i].description;
var img = document.createElement("img");
img.src=items[i].image;
var td_image=document.createElement("td");
td_image.appendChild=items[i].image;
var td_price=document.createElement("td");
td_price.innerHTML=items[i].price;
tr.appendChild(td_id);
tr.appendChild(td_name);
tr.appendChild(td_description);
tr.appendChild(td_image);
tr.appendChild(td_price);
var edit_btn = document.createElement("button");
edit_btn.innerHTML="Edit";
edit_btn.onclick=function(){
editItem(items[i]);
}

var td_edit = document.createElement("td");
td_edit.appendChild(edit_btn);



var delete_btn=document.createElement("button");
delete_btn.innerHTML="Delete";

var id = items[i].id;
delete_btn.onclick=function(){
deleteItem(id);
}
var delete_edit = document.createElement("td");
delete_edit.appendChild(delete_btn);

var td_delete = document.createElement("td");
td_delete.appendChild(edit_btn);
td_delete.appendChild(delete_btn);


tr.appendChild(td_edit);
tr.appendChild(td_delete);
tbody.appendChild(tr);
}
}

function getItems() {
    $.ajax({
        url: "http://localhost:8000/getitems",
        type: "GET",
        beforeSend: function(request) {
            request.setRequestHeader("Authorization", localStorage.getItem("token"));
        },
        success: function(data) {
           var json=JSON.parse(data);
            items=json.items;
            printItems();
        },
        error: function(err) {
            alert(err.responseText);
        }
    });
}
function deleteItem(id) {
                $.ajax({
                        url: "http://localhost:8000/deleteitem",
                        type: "POST",
                        data: JSON.stringify({
                            id: parseInt(id)
                        }),
                        success: function(data) {
                            var itemIndex=items.findIndex(item=>item.id==id);
                            items.splice(itemIndex,1);
                            printItems();
                        },
                        error: function(err) {
                            alert(err.responseText);
                        }
                    });
}