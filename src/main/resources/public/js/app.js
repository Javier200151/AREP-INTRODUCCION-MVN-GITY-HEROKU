function symbolJSON(){
    let result = {};
    var symbol = document.getElementById("symbol").value;
    let time = "" ;
    if(document.getElementById("Daily").checked == true){ time = "TIME_SERIES_DAILY" }
    else if(document.getElementById("Weekly").checked == true){ time = "TIME_SERIES_WEEKLY" }
    else if(document.getElementById("Monthly").checked == true){ time = "TIME_SERIES_MONTHLY" }

    fetch('https://sparkwebapparep.herokuapp.com/facadealpha?symbol='+symbol+'&time='+time)
        .then(res => res.json())
        .then(data => result = data)
        .then(data => {
                const tbodyEl = document.querySelector('#listItems')
                tbodyEl.innerHTML = "";
                delete data ['Meta Data'];
                console.log(data);
                for (let i in data) {
                    for (let j in data[i]) {
                        const secEl = document.createElement("tr");
                        tbodyEl.appendChild(secEl);
                        const liEl = document.createElement("th");
                        liEl.innerHTML = j; 
                        secEl.appendChild(liEl);                       
                        for (let k in data[i][j]) {
                            const liEl1 = document.createElement("td");
                            liEl1.innerHTML = data[i][j][k]; //"<p className='text-success tex-center'>"+k+": "+data[i][j][k]+"</p>");
                            secEl.appendChild(liEl1);
                        }
                        
                    }
                    
                }
        })
        .catch(error => console.log(error))
}