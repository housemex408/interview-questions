var chai = require('chai');
var Person = require('../src/Person.js').Person;
chai.should();

describe('Person', function() {
    it('should speak', function() {
            var temp = new Person("Jose");

            var result = temp.speak();

            result.should.equal('Hello, my name is Jose!');
        }),
    it('should speak (calling Object.create)', function() {
        var temp = Object.create(Person.prototype, {
            name: {
                value: 'Jose'
            }
        });

        var result = temp.speak();

        result.should.equal('Hello, my name is Jose!');
    })
})
