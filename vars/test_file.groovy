#!/usr/bin/env groovy
def call(){
  def name = 'batman'
  def city = 'Gotham'
  def villain = 'joker'
  
  if (name == 'batman'){
    sh 'echo this is batman'
  } else if (city=='Gotham'){
      sh 'echo this is Gotham city'
    } else(villain=='joker'){
        sh 'echo this is joker'
  }
}
