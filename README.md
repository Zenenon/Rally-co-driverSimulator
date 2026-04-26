Rally Co-Driver Simulator - Command Guide

Welcome to the Rally Co-Driver Simulator. This guide will teach you how to use the text-based navigation system to pilot your car through stages using authentic rally pace notes.
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

3. Advanced: Complex Sequences

You can chain multiple instructions together using commas. Real rally stages require preparing for a turn long before you reach it.
The "Pro" Approach: Brake-Turn-Accelerate

If you approach a sharp corner at 180 km/h, the car will understeer (plow straight) because the tires lose grip at high speeds. You must slow down first.

Complex Command Example:
do prawej, pełne hamowanie, 80, lewy 5 zduś, 30, szczyt dnem, 150

Breakdown of the flow:

    do prawej: Move to the right side of the road to "open up" the next left turn.

    pełne hamowanie, 80: Slam the brakes for 80 meters to drop from high speed.

    lewy 5 zduś, 30: Now that you are slow, take a very sharp left turn using engine braking (zduś) for 30 meters.

    szczyt dnem, 150: Aim for the crest of the hill, floor the gas (dnem), and blast forward for 150 meters.

4. Full Command Reference
Steering (Direction & Severity)
Command	Type	Description
lewy / L	Direction	Steer to the left.
prawy / P	Direction	Steer to the right.
1 to 5	Severity	1 = Fast/Wide, 5 = Slow/Sharp.
maks / max	Severity	The tightest possible steering angle.
nawrót	Severity	A 180-degree U-turn (Hairpin).
Speed Modifiers (Must follow a Turn or Crest)
Modifier	Effect	Physics Impact
dnem / _	Full Throttle	Maximum acceleration.
plus / +	Aggressive	High acceleration.
pół / pol	Gentle	Light acceleration.
zduś / zdus	Engine Brake	Significant speed reduction during a turn.
Braking Actions
Action	Intensity	Usage
przyhamuj	Light	Settle the car before a fast curve.
hamuj	Medium	Standard braking for most corners.
pełne hamowanie	Heavy	Emergency stopping or preparing for hairpins.
Positioning and Environment
Command	Effect
do lewej	Hug the left side of the track.
do prawej	Hug the right side of the track.
z drogi	Drive on the shoulder/rough surface.
szczyt / ^	A crest. Steering is less effective while the car is "light."
ciąć	Instruction to cut the corner (inner apex).
nie ciąć	Warning to stay on the road (outer apex).
5. Important Rules to Remember

    Physics Limit: If you are going faster than 100 km/h, sharp turns (4, 5, MAX) will cause the car to slide straight. Brake before you turn!

    Case Sensitivity: All text commands must be entered in lowercase.

    Syntax: Modifiers (+, _, zduś, etc.) cannot be used alone with a distance. They must follow a Turn or a Crest (e.g., lewy 2 dnem, 100 is correct; dnem, 100 will cause an error).
