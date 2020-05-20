# MachineLearningDecisionTree
Implementing machine learning techniques such as decision tree building and classification. This implementation is used to classify credit loan risk qualification, and restaurant seating.


# How To Build
`make`

## to run the loan qualification program
`make loan`


# Loan Qualification Schema

```
5

income
3
<$15K $15-35K >$35K

collateral
2
ADEQUATE NONE

debt
2
HIGH LOW

creditHis
3
BAD GOOD UNKNOWN

risk
3
HIGH MODERATE LOW
```

# Example of Schema
```
income collateral debt creditHis risk
<$15K   NONE     HIGH BAD 	HIGH
$15-35K NONE     HIGH UNKNOWN	HIGH
$15-35K NONE     LOW  UNKNOWN	MODERATE
<$15K   NONE     LOW  UNKNOWN	HIGH
>$35K   NONE     LOW  UNKNOWN	LOW
>$35K   ADEQUATE LOW  UNKNOWN	LOW
<$15K   NONE     LOW  BAD	HIGH
>$35K   ADEQUATE LOW  BAD	MODERATE
>$35K   NONE     LOW  GOOD	LOW
>$35K   ADEQUATE HIGH GOOD	LOW
<$15K   NONE     HIGH GOOD	HIGH
$15-35K NONE     HIGH GOOD	MODERATE
>$35K   NONE     HIGH GOOD	LOW
$15-35K NONE     HIGH BAD	HIGH 
```
