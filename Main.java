int clamp(int lower, int upper, int n) {
  return Math.min(upper, Math.max(n, lower));
}

clamp(0, 10, 7)
clamp(0, 10, 12)
clamp(0, 10, -3)

// making a clamp with a specific range
// Function is a functional interface from Java library
// with a single method apply
Function<Integer, Integer> makeClamp(int lower, int upper) {
  return x -> Math.min(upper, Math.max(x, lower));
}

var gradeClamp = makeClamp(0, 100)
gradeClamp.apply(55)
gradeClamp.apply(155)
gradeClamp.apply(-55)