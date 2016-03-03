var Person = function(name)
{
  this.name = name;
}

Person.prototype.speak = function(){
  return 'Hello, my name is ' + this.name + '!';
}

module.exports = Person;
