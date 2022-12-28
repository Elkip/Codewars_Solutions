duplicate_encode <- function(word){
  chars <- tolower(strsplit(word, "")[[1]])
  dupes <- chars[duplicated(chars)]
  result<-paste(ifelse(chars%in%dupes,")","("), collapse = "")
  return(result)
}

duplicate_encode("din")
duplicate_encode("recede")
duplicate_encode("Success")
duplicate_encode("(( @")