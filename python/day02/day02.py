from pathlib import Path


def get_file_contents() -> list:
    path = Path(__file__).parent / "../resources/day02.txt"
    with path.open() as f:
        lines = f.readlines()

    return lines


def solve_part1(data: list) -> int:
    horiztonal = 0
    depth = 0

    for line in data:
        direction, quantity = line.split(' ')
        quantity = int(quantity)

        if 'forward' == direction:
            horiztonal = horiztonal + quantity
        elif 'up' == direction:
            depth = depth - quantity
        else:
            depth = depth + quantity

    return horiztonal * depth


def solve_part2(data: list) -> int:
    horiztonal = 0
    depth = 0
    aim = 0

    for line in data:
        direction, amount = line.split(' ')
        amount = int(amount)

        if 'forward' == direction:
            horiztonal = horiztonal + amount
            depth = depth + (amount * aim)
        elif 'up' == direction:
            aim = aim - amount
        else:
            aim = aim + amount

    return horiztonal * depth


if __name__ == '__main__':
    data = get_file_contents()

    part1 = solve_part1(data)
    print(f'Part1: {part1}')

    part2 = solve_part2(data)
    print(f'Part 2: {part2}')
