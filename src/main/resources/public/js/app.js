function symbolJSON(){
    let cont1 = 0;
    let cont2 = 0;
    let result = {};
    var symbol = document.getElementById("symbol").value;

    fetch('https://sparkwebback.herokuapp.com/facadealpha?symbol='+symbol)
        .then(res => res.json())
        .then(data => result = data)
        .then(data => {
            const tbodyEl = document.querySelector('#listItems')
            tbodyEl.innerHTML = "";
            for (let i in data) {
                for (let j in data[i]) {
                    const secEl = document.createElement("tr");
                    tbodyEl.appendChild(secEl);
                    cont1++;
                    if(cont1>5){
                        const liEl = document.createElement("th");
                        liEl.innerHTML = j; 
                        secEl.appendChild(liEl);
                    }
                    for (let k in data[i][j]) {
                        cont2++;
                        if(cont2>79){
                            const liEl1 = document.createElement("td");
                            liEl1.innerHTML = data[i][j][k]; //"<p className='text-success tex-center'>"+k+": "+data[i][j][k]+"</p>");
                            secEl.appendChild(liEl1);
                        }
                    }
                    
                }
                
            }
        })
        .catch(error => console.log(error))
}