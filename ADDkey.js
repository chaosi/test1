
function myFunction(name)
{
txtInput.value = txtInput.value + name;
 document.getElementById(name).style.display = "none";
 
 
  userName = txtInput.value;

  if (userName == "AND")
  {
    if(typeof(Storage)!=="undefined")
 	 {
 	 if (localStorage.clickcount)
  	  {
 	   localStorage.clickcount=Number(localStorage.clickcount)+10;
 	  }
 	 else
     {
   	  localStorage.clickcount=1;
     }
 	  document.getElementById("credits").innerHTML=" Gold " + localStorage.clickcount + " ";
    }
   
   
   
   localStorage.currentllvl ="lvl2"; // prepare for next lvl
 
  
  window.open(localStorage.currentllvl+ ".html","_self")
  

   
   
  
  }
 
}
























