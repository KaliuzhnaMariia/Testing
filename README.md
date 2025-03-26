# Testing
1) Class name capitalization - The class name was changed to HumanBMI to follow Java's PascalCase naming convention (class humanIMB -> class HumanBMI).
2) Variable names in camelCase - Variable names were changed to follow Java’s camelCase naming convention (W, H; imb -> weight, height, bmi).
3) Terminology correction - The incorrect abbreviation IMB was replaced with the correct term BMI (humanIMB -> HumanBMI).
4) Logical operator && instead of & - The bitwise & operator was replaced with the logical && operator in if statements (& -> &&).
5) Changed initial string value and ensured a return value - Using null could lead to a NullPointerException. It was replaced with an "Problem" string to ensure safety. (String string = null; ->String string = "Problem";).
6) Height == 0 check to avoid exceptions - A check was added to prevent division by zero, which would cause an ArithmeticException (in public HumanBMI(double weight, double height)).
7) Renamed Result() method to getResult() - The method name now starts with a lowercase letter and is more descriptive, following Java naming conventions (Result() -> getResult()).
