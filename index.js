const container = document.querySelector("#container")
const h1 = container.querySelector("#name")
const p = container.querySelector("#brand")

const fd = fetch("http://localhost:8080/list")
.then(r=> r.json())
.then(data => {
    console.log(data[0]);
    // h1.innerHTML = JSON.stringify(data[0].name);
    // p.innerHTML = JSON.stringify(data[0].brand)
    // h1.innerHTML = data[0].name
    // p.innerHTML = data[0].brand

    data.map(item => {
        const newItem = document.createElement("div")
        newItem.innerHTML =`
            <h3> ${item.name} </h3>
            <p> ${item.brand} </p>
        `;
        container.appendChild(newItem)
    })

})
.catch(err => {
    console.error(err)
})

