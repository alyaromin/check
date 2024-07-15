# check

Console app for genereating CSV-file (result.csv) with list of products, their quantity and price including discount.

## console command description

```console
java -cp bin ./src/main/java/ru/clevertec/check/CheckRunner.java id-quantity discountCard=xxxx balanceDebitCard=xxxx
```
Command parameters:
- id-quantity - product identifier and quantity (required, at least one pair "id-quantity", "id" can be duplicated)
- discountCard=xxxx - number of discount card (optional, any four digits)
- balanceDebitCard=xxxx - balance on debit card (required, any amount, can be with two decimal places and negative; decimal sign is dot, e.g. 1.23)

Example of usage:
```console
java -cp src ./src/main/java/ru/clevertec/check/CheckRunner.java 3-1 2-5 5-1 discountCard=1111 balanceDebitCard=100
```
