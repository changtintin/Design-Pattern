#ifndef COMPARABLE_HPP
#define COMPARABLE_HPP

template<class T>
class Comparable {
public:
    virtual bool compareTo(T other) = 0;
    virtual void displayVal() = 0;
};

#endif