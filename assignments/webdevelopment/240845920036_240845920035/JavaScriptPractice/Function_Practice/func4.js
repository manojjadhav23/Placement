const total = function (...n)
{
    let total = 0;
    for (let i of n)
    {
        if(typeof i==='number')
            total = total + i;
    }   
       return total;
}