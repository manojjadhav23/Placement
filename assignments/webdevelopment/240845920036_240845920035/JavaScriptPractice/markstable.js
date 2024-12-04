var hm,cm,jm,bm,tot,avg,grd;
function getresult()
{     
    hm=+html.value;
    cm=+css.value;
    jm=+js.value;
    bm=+bs.value;
    tot = hm+cm+jm+bm;
    avg = tot/4;
    if(hm>39&&cm>39&&jm>39&&bm>39)
    {
      grd = avg>90 ? "A+" :  avg>80 ? "A" : avg>70 ? "B+" : avg>60 ? "B" : avg>50 ? "C" : "D";
    } 
    else{
        grd = "Fail";
    } 
      total.value = 'The total marks are:'+tot;
      average.value = 'The average is:'+avg;
      grade.value = 'The grade is:'+grd;
} 

