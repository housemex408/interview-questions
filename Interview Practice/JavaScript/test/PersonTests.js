var chai = require('chai');
var Person = require('../src/Person.js');
chai.should();

describe ('Person', function() {
  it('should speak', function() {
    var temp = new Person("Jose");

    var result = temp.speak();

    result.should.equal('Hello, my name is Jose!');
  })
})
