Rally Co-Driver Simulator - Command Guide

Welcome to the Rally Co-Driver Simulator. This guide will teach you how to use the text-based navigation system to pilot your car through stages using authentic rally pace notes.

How to Run the Program

    Requirements: Ensure you have Java 17 or higher installed.

    Compilation: If you are using an IDE (like IntelliJ IDEA), ensure the antlr-4.13.2-complete.jar is added to your project's libraries.

    Launch: Run the RallyLauncher.java file located in the game package.

    Interface:

        The Map: The car is centered on the screen.

        Prediction Arrows: When the car is waiting for a command, you will see dashed arrows showing where the car would go if you turn left, right, or go straight at your current speed.

        The Console: Type your commands in the text field at the bottom and press Enter.

1. Basics: Moving and Turning

In the world of rally, instructions are usually given as a Direction, a Severity, and a Distance.
Moving Straight

To move the car in its current direction, simply type a number (meters).

    100 — Moves the car 100 meters forward at its current speed.

    50 prosto — Moves the car 50 meters forward.

Simple Turns

Turns are defined by direction (lewy or prawy) and severity (1 to 5, where 1 is wide and 5 is sharp).

    lewy 2, 100 — A wide left turn followed by 100m of travel.

    prawy 4, 50 — A sharp right turn followed by 50m of travel.

    Note: All text commands must be lowercase.

2. Intermediate: Speed and Braking

The car maintains its current speed unless you tell it otherwise. To go faster or slower, use Modifiers or Actions.
Acceleration (Modifiers)

Modifiers like dnem (flat out) or plus (faster) must follow a turn or a crest.

    lewy 3 dnem, 200 — Take a medium left turn at full throttle and keep that speed for 200m.

    prawy 2 +, 100 — Take a wide right turn while accelerating moderately for 100m.

Braking (Actions)

Braking is an action that resets your acceleration to a negative value.

    hamuj, 100 — Apply standard brakes for 100m.

    pełne hamowanie, 50 — Apply maximum braking force for 50m.

    przyhamuj, lewy 2, 80 — Tap the brakes, then enter a wide left turn for 80m.

3. The Loop: Repetitive Commands

If you need to perform the same sequence multiple times (e.g., a slalom or a repetitive technical section), you can use the Repetition Mechanic.

Syntax: [count]x [ [sequence] ]

    Slalom Example: 3x [L 2, 50, P 2, 50]

        The car will turn left for 50m, then right for 50m, and repeat this cycle 3 times.

    Sequential Braking: 2x [hamuj, 50, 50]

        Brake for 50m, then coast for 50m, repeated twice.

    Complex Loop: szczyt dnem, 100, 2x [L 4, 30, hamuj, 20]

        Floor it for 100m, then repeat the sequence (Sharp Left -> Brake) twice.
4. Advanced: Complex Sequences

You can chain multiple instructions using commas. Real rally stages require preparing for a turn long before you reach it.
The "Pro" Approach: Brake-Turn-Accelerate

If you approach a sharp corner at 180 km/h, the car will understeer (plow straight) because the tires lose grip at high speeds. You must slow down first.

Complex Command Example:
do prawej, pełne hamowanie, 80, lewy 5 zduś, 30, szczyt dnem, 150

Breakdown of the flow:

    do prawej: Move to the right side of the road to "open up" the next left turn.

    pełne hamowanie, 80: Slam the brakes for 80 meters to drop speed.

    lewy 5 zduś, 30: At low speed, take a sharp left turn using engine braking (zduś).

    szczyt dnem, 150: Aim for the hill crest, floor the gas, and blast forward.

5. Important Rules to Remember

    Physics Limit: If you are going faster than 100 km/h, sharp turns (4, 5, MAX) will cause the car to slide straight. Brake before you turn!

    Case Sensitivity: All text commands must be entered in lowercase.

    Syntax: Modifiers (+, _, zduś, etc.) cannot be used alone with a distance. They must follow a Turn or a Crest (e.g., lewy 2 dnem, 100 is correct; dnem, 100 will cause an error).
