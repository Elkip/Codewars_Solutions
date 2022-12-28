# word - a word
# return - sum of the score of each letter (a = 1, b = 2, ...)
score <- function(word) {
  chars <- strsplit(word, "")[[1]]
  total <- NULL
  for (i in chars) {
    total <- c(total, (as.numeric(match(i, letters))))
  }
  sum(total)
}

score2 <- function(word) {
  chars <- strsplit(word, "")[[1]]
  val < - structure(1:26, names = letters)
  sum(val[chars])
}

# x - a string of words seperated by spaces
# return - Word with the highest score
high <- function(x) {
  wrds <- strsplit(x, " ")[[1]]
  m <- wrds[1]
  for (i in (2:(length(wrds)))) {
    if(score(wrds[i]) > score(m)) {
      m <- wrds[i]
    }
  }
  return(m)
}

high2 <- function(x) {
  wrds <- strsplit(x, " ")[[1]]
  wrds[which.max(sapply(words, score2))]
}

test_that("Sample Tests", {
  expect_equal(high('man i need a taxi up to ubud'), 'taxi')
  expect_equal(high('what time are we climbing up the volcano'), 'volcano')
  expect_equal(high('take me to semynak'), 'semynak')
  expect_equal(high('aa b'), 'aa')
  expect_equal(high('b aa'), 'b')
  expect_equal(high('bb d'), 'bb')
  expect_equal(high('d bb'), 'd')
  expect_equal(high('aaa b'), 'aaa')
})