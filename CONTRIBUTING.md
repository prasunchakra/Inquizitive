# Contributing to InQuizitive

Thank you for your interest in contributing to InQuizitive! This document provides guidelines and instructions for contributing to the project.

## 🎯 Development Process

1. Fork the repository
2. Create a new branch for your feature/fix
3. Make your changes
4. Run tests and linters
5. Submit a pull request

## 📝 Code Style & Quality

### Frontend (React)
- Follow the [Airbnb React/JSX Style Guide](https://github.com/airbnb/javascript/tree/master/react)
- Run ESLint before committing:
```bash
npm run lint
```

### Backend (FastAPI)
- Follow [PEP 8](https://www.python.org/dev/peps/pep-0008/) style guide
- Run flake8 before committing:
```bash
flake8 .
```

## 🧪 Testing

### Frontend Tests
```bash
npm run test
```

### Backend Tests
```bash
pytest
```

### BDD Tests (Cucumber)
```bash
# Run all BDD tests
npm run test:bdd
```

## 📤 Commit Message Convention

We follow the [Conventional Commits](https://www.conventionalcommits.org/) specification:

```
<type>(<scope>): <description>

[optional body]

[optional footer]
```

Types:
- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `style`: Code style changes (formatting, etc.)
- `refactor`: Code refactoring
- `test`: Adding or modifying tests
- `chore`: Maintenance tasks

Example:
```
feat(auth): add Google OAuth login

- Implement Google OAuth integration
- Add user profile creation
- Update documentation

Closes #123
```

## 🔄 Pull Request Process

1. Update the README.md with details of changes if needed
2. Update the documentation if you're changing functionality
3. The PR will be merged once you have the sign-off of at least one other developer
4. Make sure all tests pass and there are no linting errors

## 🐛 Bug Reports

Please use the GitHub issue tracker to report bugs. Include:
- Clear description of the issue
- Steps to reproduce
- Expected behavior
- Actual behavior
- Screenshots if applicable
- Environment details (OS, browser, etc.)

## 💡 Feature Requests

We love feature requests! Please include:
- Clear description of the feature
- Use cases
- Any relevant examples
- Why this would be useful to most users

## 📚 Documentation

- Keep documentation up to date
- Use clear and concise language
- Include code examples where appropriate
- Update API documentation when making changes

## 🤝 Questions?

Feel free to open an issue for any questions about contributing. We're here to help!

---

Thank you for contributing to InQuizitive! 🚀
