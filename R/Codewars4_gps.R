library(testthat)
# x - a vector of distances from the origin
# s - how much time between every measure of distance
# returns - an integer of the maximum average speed
gps <- function(s, x) {
    m <- 1
    if (length(x) > 1) {
        for (i in 1:(length(x)-1)) {
            spd <- floor((3600*(x[i+1] - x[i]))/s)
            m <- max(m, spd)
        }
        return(m)
    } else {
        return(0)
    }
}

gps <- function(s, x) {
    if (length(x) <= 1) 0 else floor(max(3600*diff(x)/s))
}

testing <- function(s, x, expect) {
    cat("s: ", s, "\n")
    dput(x)
    actual <- gps(s, x)
    cat("actual ", actual, "\n")
    cat("expect ", expect, "\n")
    expect_equal(actual, expect)
}

test_that("test gps", {
    x <- c(0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61)
    s <- 20
    u <- 41
    testing(s, x, u)
    x <- c(0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25)
    s <- 12
    u <- 219
    testing(s, x, u)
})

gps(c(0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25), 12)
