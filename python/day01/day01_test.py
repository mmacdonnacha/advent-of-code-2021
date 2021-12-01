from day01 import get_depth_count_part1
from day01 import get_depth_count_part2


def test_part1_emptyList():
    given = []
    expected = 0
    actual = get_depth_count_part1(given)

    assert expected == actual


def test_part1_oneIncrease():
    given = [199, 200]
    expected = 1
    actual = get_depth_count_part1(given)

    assert expected == actual


def test_part1_example_data():
    given = [199, 200, 208, 210, 200, 207, 240, 269, 260, 263]
    expected = 7
    actual = get_depth_count_part1(given)

    assert expected == actual


# Part 2

def test_part2_emptyList():
    given = []
    expected = 0
    actual = get_depth_count_part2(given)

    assert expected == actual


def test_part2_oneIncrease():
    given = [199, 200, 208, 210]
    expected = 1
    actual = get_depth_count_part2(given)

    assert expected == actual


def test_part2_example_data():
    given = [199, 200, 208, 210, 200, 207, 240, 269, 260, 263]
    expected = 5
    actual = get_depth_count_part1(given)

    assert expected == actual
