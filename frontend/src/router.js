
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserManager from "./components/listers/UserCards"
import UserDetail from "./components/listers/UserDetail"

import AssetManager from "./components/listers/AssetCards"
import AssetDetail from "./components/listers/AssetDetail"

import SearchManager from "./components/listers/SearchCards"
import SearchDetail from "./components/listers/SearchDetail"

import CollaborationManager from "./components/listers/CollaborationCards"
import CollaborationDetail from "./components/listers/CollaborationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/users',
                name: 'UserManager',
                component: UserManager
            },
            {
                path: '/users/:id',
                name: 'UserDetail',
                component: UserDetail
            },

            {
                path: '/assets',
                name: 'AssetManager',
                component: AssetManager
            },
            {
                path: '/assets/:id',
                name: 'AssetDetail',
                component: AssetDetail
            },

            {
                path: '/searches',
                name: 'SearchManager',
                component: SearchManager
            },
            {
                path: '/searches/:id',
                name: 'SearchDetail',
                component: SearchDetail
            },

            {
                path: '/collaborations',
                name: 'CollaborationManager',
                component: CollaborationManager
            },
            {
                path: '/collaborations/:id',
                name: 'CollaborationDetail',
                component: CollaborationDetail
            },



    ]
})
