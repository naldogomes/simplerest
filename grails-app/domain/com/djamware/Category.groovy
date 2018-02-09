package com.djamware

import grails.rest.*

@Resource(uri='/category')
class Category {

  String catName

  static constraints = {
    catName blank:false
  }
}
