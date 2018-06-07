package hu.p92.workout.service

import hu.p92.workout.model.Workout

interface WorkoutService {
    fun workoutList() : Set<Workout>
}