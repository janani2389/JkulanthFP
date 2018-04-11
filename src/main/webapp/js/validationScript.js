function validateForm(myForm)
 {
 	alert("insdie method");

 	var errMsg = "";
     for(var i=0; i<myForm.elements.length; i++){

    	 if(myForm.elements[i].value==""){
    		 
    		 errMsg = errMsg + myForm.elements[i].placeholder+ "\n";
    		 
    	 }
     }
   
      
     
     if(errMsg == ""){
     	myForm.submit();
     }else{
     	
     	alert("Please correct below Errors \n" + errMsg);
     	return false;
     }
 }