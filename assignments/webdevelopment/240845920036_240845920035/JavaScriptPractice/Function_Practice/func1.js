function add(x,y)
{

   return x+y;
} 

function isprime(num)
{
    let i, flag = false; 
    for (i = 2; i <= num / 2; i++) 
   {
      if(num%2==0)
        {
            flag = true;
            break;
        }      
    } 
    return (flag==true) ? false : true;
}