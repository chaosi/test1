window.onload = selectChoose;
function selectChoose()
{
	txtInput.InnerHTML = "" ;
	if(typeof(Storage)!=="undefined")
	{

	document.getElementById("credits").innerHTML=" Gold " + localStorage.clickcount ;
	}
	else
	{
   
	localStorage.clickcount = "0";
	document.getElementById("credits").innerHTML=" Gold " + localStorage.clickcount ;	
	}
}