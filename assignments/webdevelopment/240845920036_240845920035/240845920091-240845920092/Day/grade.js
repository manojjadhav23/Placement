//defining a function for finding grade 
function getResult()
{
  let hm,cm,jm,tot,avg,grd;	

  hm= +htmlMarks.value;

  cm= +cssMarks.value;

  jm= +jsMarks.value;
  
  tot=hm+cm+jm;

  avg=tot/3;
  
  if(hm>39 && cm>39 && jm>39)
  {
    //pass	  
	  grd = avg>=90? "A+" : avg>=80? "A" : avg>=70? "B+" : avg>=60? "B" :avg>=50? "C" : "D";	
  } 
  else {
	  grd="Fail"
  }
  
  total.value='Total Marks	:'+tot;
  average.value='Average	:'+avg;
  grade.value='Grade	:'+grd;	


}