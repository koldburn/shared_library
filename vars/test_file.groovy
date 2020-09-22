#!/usr/bin/env groovy
def call(){
  def name = 'batman'
  def city = 'Gotham'
  def villain = 'joker'
  if(name=='batman'){
     sh 'echo this is batman'
     }else{ sh 'echo hahahaha'}
}
