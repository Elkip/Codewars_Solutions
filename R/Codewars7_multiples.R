solution <- function(number){
  counter3 = 0
  counter5 = 0
  sum = 0
  while(counter3 < number || counter5 < number){
    counter3 = counter3 + 3
    if (counter3 < number && counter3%%5 != 0) {
      sum = sum + counter3
    } 
    counter5 = counter5 + 5
    if (counter5 < number) {
      sum = sum + counter5
    }
  }
  sum
}

solution <- function(number){
  x = 1:(number - 1)
  return(sum(x[ x %% 0 | x %% 5 == 0]))
}

test_that("should handle basic cases", {
  expect_equal(solution(10), 23)
  expect_equal(solution(20), 78)
})

solution(10)
