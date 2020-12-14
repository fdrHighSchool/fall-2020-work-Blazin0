/**
  class main{
  print(...)
  N = nextInt
  print(...)
  V = nextInt
  if ISS
    if start > 0 or num > 0
      print(...)
    else
      FNDS(N,V)
}

N: IsSelfDivisor()
P: See if the number is a positive Integer
I: The Positive Integer
R: True
(ISS)
IsSelfDivisor(number){
  while num less than 0{
   if num mod 10 == 0 or number % (number % 10) != 0{
   (if the number is divisible by 10 or the number mod by its
   self disivor does not equal 0 than)
    return false
  }
  return true
}
N: FirstNumSelfDivisor()
P: Find
I: start and num
R: Array of size num that contains the first
"num" self-divsiors that are greater than or equal to "start".
(FNSD)
FirstNumSelfDivisor(num, value){
 int[] list
 placement = 0
 while loop(placement < num) {
  if (selfdivisor(num)){
    add on list
    placement++
    }
  }
  return list
}
  */
