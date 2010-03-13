# Basic Typed Stack

This is a very small Java project I developped for school. I'm not very good at Java but I tried to write something clean.
Basic Typed Stack has been developped to work into the console, there is not GUI version. It uses Counter class from Basic Clock for the test.

    ~% javac *.java
    ~% java Main
    *** TEST START ***
    Counter stack initializing...
    Counter stack initalized:
    Counter #3[ class Counter@13250954 class Counter@8030483 class Counter@12416126 ]
    Getting the last pushed Counter...
    Outputing popped Counter (class Counter@12416126) end value: 30
    Current Counter stack state:
    Counter #2[ class Counter@13250954 class Counter@8030483 ]
    *** TEST END ***
    ~%

## Methods

### Stack class

    public Stack();
    public Stack(int length);
    public Stack push(Object obj);
    public Object pop();
    public int getLength();
    public boolean isEmpty();
    public boolean isFull();
    public String toString();
    

### TypedStack class

    public TypedStack(String type);
    public TypedStack(String type, int length);
    public TypedStack push(Object obj);
    public String toString();

## Changelog

** 2010-03-13 — v.1.00

* Initial release

## Licence

Basic Typed Stack uses the MIT Licence.

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

## Contact

Copyright (c) 2010, Joris Berthelot

Joris Berthelot <admin@eexit.net>