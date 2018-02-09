package com.djamware

import grails.rest.*

@Resource(uri='/profile')
class Profile {

  //static belongsTo = [category:Category]
  String username
  String name
  String lastName
  Date createDate =  new Date()

  static constraints = {
    username blank: false
    name blank: false
    lastName blank: false
  }
}