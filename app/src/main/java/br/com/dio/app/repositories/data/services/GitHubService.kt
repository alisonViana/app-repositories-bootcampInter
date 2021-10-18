package br.com.dio.app.repositories.data.services

import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepos(@Path("users") user: String): List<Repo>
}