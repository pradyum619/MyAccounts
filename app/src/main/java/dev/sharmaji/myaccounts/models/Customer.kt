package dev.sharmaji.myaccounts.models

class Customer (val id: Long, val name: String, val number: String?, val due: Long = 0 , val transactionArr: Array<Transaction>)