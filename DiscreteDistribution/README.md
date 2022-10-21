
# Discrete Distribution

This is a program that takes an integer command-line argument `m`, followed by a sequence of positive integer command-line arguments `a`<sub>`1`</sub>, `a`<sub>`2`</sub>, …, `a`<sub>`n`</sub>, and prints `m` random indices (separated by whitespace), choosing each index `i` with probability proportional to `a`<sub>`i`</sub>.

    java DiscreteDistribution 25 1 1 1 1 1 1
    5 2 4 4 5 5 4 3 4 3 1 5 2 4 2 6 1 3 6 2 3 2 4 1 4

    java DiscreteDistribution 25 10 10 10 10 10 50
    3 6 6 1 6 6 2 4 6 6 3 6 6 6 6 4 5 6 2 2 6 6 2 6 2

    java DiscreteDistribution 25 80 20
    1 2 1 2 1 1 2 1 1 1 1 1 1 1 1 2 2 2 1 1 1 1 1 1 1 