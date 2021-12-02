from pathlib import Path


def get_file_contents() -> list:
    path = Path(__file__).parent / "../resources/day01.txt"
    with path.open() as f:
        lines = f.readlines()

    return lines


def solve_part1(depths: list) -> int:
    if len(depths) <= 1:
        return 0

    count = 0

    for i in range(len(depths)-1):
        if depths[i] < depths[i+1]:
            count = count + 1

    return count


def solve_part2(depths: list) -> int:
    if len(depths) < 4:
        return 0

    count = 0

    for i in range(len(depths)-3):
        first_window = depths[i] + depths[i+1] + depths[i+2]
        second_window = depths[i+1] + depths[i+2] + depths[i+3]

        if first_window < second_window:
            count = count + 1

    return count


if __name__ == '__main__':
    lines = get_file_contents()
    depths = [int(x) for x in lines]

    part1 = solve_part1(depths)
    print(f'Part 1: {part1}')

    part2 = solve_part2(depths)
    print(f'Part 2: {part2}')
