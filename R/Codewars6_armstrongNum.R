# num - an integer
# returns if the number is an armstrong number
armstrong <- function(num){
  digits <- as.numeric(strsplit(as.character(num), "")[[1]])
  sum(sapply(digits, function (n) {
    n**length(digits)
  })) == num
}

armstrong2 <- function(num){
  digits <- as.numeric(strsplit(as.character(num), "")[[1]])
  sum(digits**length(digits)) == num
}

armstrong(153)
armstrong(200)