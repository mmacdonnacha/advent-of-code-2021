from day02 import solve_part1
from day02 import solve_part2


def test_part1_with_empty_data():
    given = []
    expected = 0
    actual = solve_part1(given)

    assert expected == actual


def test_part1_with_example_data():
    given = ['forward 5', 'down 5', 'forward 8',
             'up 3', 'down 8', 'forward 2']
    expected = 150
    actual = solve_part1(given)

    assert expected == actual


# Part 2

def test_part2_with_empty_data():
    given = []
    expected = 0
    actual = solve_part2(given)

    assert expected == actual


def test_part2_with_example_data():
    given = ['forward 5', 'down 5', 'forward 8',
             'up 3', 'down 8', 'forward 2']
    expected = 900
    actual = solve_part2(given)

    assert expected == actual
