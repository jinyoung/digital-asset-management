<template>

    <v-card outlined>
        <v-card-title>
            CreateUser
        </v-card-title>

        <v-card-text>
            <String label="Username" v-model="value.username" :editMode="editMode"/>
            <String label="Password" v-model="value.password" :editMode="editMode"/>
            <String label="Role" v-model="value.role" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createUser"
            >
                CreateUser
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateUserCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.username = '';
            this.value.password = '';
            this.value.role = '';
        },
        watch: {
        },
        methods: {
            createUser() {
                this.$emit('createUser', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

