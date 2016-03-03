var MYApp = MYApp || {};

MYApp.Person = {};

MYApp.Person = function(name)
{
  this.name = name;
}

MYApp.Person.prototype.speak = function(){
  return 'Hello, my name is ' + this.name + '!';
}

module.exports = MYApp;
