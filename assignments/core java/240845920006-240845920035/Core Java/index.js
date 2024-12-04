function fetchdata()
{
    const xhr=new XMLHttpRequest();
    xhr.open("GET","https://jsonplaceholder.typicode.com/users");

    xhr.send();
    xhr.onreadystatechange=() =>{

        if(xhr.readyState==4 && xhr.status==200){
      //  console.log(xhr.responseText);//get json object in text format
        const data=JSON.parse(xhr.responseText);
        console.log(data);
        const container1=document .getElementById("container");
        for(i=0;i<data.length;i++){
            const row=document.createElement("tr");
            const idcol=document.createElement("td");
            const namecol=document.createElement("td");
           const phonecol= document.createElement("td");
           const mailcol= document.createElement("td");
           idcol.innerHTML=data[i].id;
           namecol.innerHTML=data[i].name;
           phonecol.innerHTML=data[i].phone;
           mailcol.innerHTML=data[i].email;
           row.appendChild(idcol);
           row.appendChild(namecol);
           row.appendChild(phonecol);
           row.appendChild(mailcol);
            container.appendChild(row);
        }
        }
    }

}


