divisors <- function(n) {
  sum = 0
  product = 0
  j = 0
  for (i in 1:n) {
    product = i*j
    j = 0
    while (product <= n) {
      j = j + 1
      product = i*j
      if (product == n) {
        print(i, j)
        if (i == j) {
          sum = sum + 1
        } else {
          sum = sum + 2
        }
      } 
    }
  }
  return(sum)
}
divisors(11)